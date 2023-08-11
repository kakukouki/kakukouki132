package com.dreamtank.aop;

import com.alibaba.fastjson.JSONObject;
import com.dreamtank.mapper.OperateLogMapper;
import com.dreamtank.pojo.OperateLog;
import com.dreamtank.utils.JwtUtils;
import io.jsonwebtoken.Claims;
import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.Arrays;

@Slf4j
@Component
@Aspect
public class LogAspect  {
    @Autowired
    private HttpServletRequest request;

    @Autowired
    private OperateLogMapper operateLogMapper;

    @Around("@annotation(com.dreamtank.anno.Log)")
    public Object recordLog(ProceedingJoinPoint joinPoint) throws Throwable {
        String jwt = request.getHeader("token");
        Claims claims = JwtUtils.parseJWT(jwt);
        Integer operateUser = (Integer) claims.get("id");

        LocalDateTime operateTime = LocalDateTime.now();

        String cLassName = joinPoint.getTarget().getClass().getName();

        String methodName = joinPoint.getSignature().getName();

        Object[] args = joinPoint.getArgs();
        String methodParams = Arrays.toString(args);


        long begin = System.currentTimeMillis();
        Object result = joinPoint.proceed();
        long end = System.currentTimeMillis();
        String returnValue = JSONObject.toJSONString(result);

        long costTime = end - begin;



        OperateLog operateLog = new OperateLog(null, operateUser, operateTime, cLassName, methodName, methodParams, returnValue, costTime);
        operateLogMapper.insert(operateLog);

        log.info("AOP记录操作日志：{}", operateLog);


        return result;
    }
}
