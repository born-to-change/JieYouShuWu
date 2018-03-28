package graduation.project.api.util;

import com.google.common.collect.Maps;
import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Map;

/**
 * Created by zhouwr on 2017/10/12
 */
@Slf4j
public class Types {

    private static final Map<Class, Class> argClassMap = Maps.newHashMap();

    public static Class detectFirstGenericArgType(Class clazz) {
        Class argClass = argClassMap.get(clazz);
        if (argClass != null) {
            return argClass;
        }
        Type superType = clazz.getGenericSuperclass();
        while (superType != null && !ParameterizedType.class.isAssignableFrom(superType.getClass())) {
            superType = ((Class) superType).getGenericSuperclass();
        }
        if (superType == null) {
            return null;
        }
        argClass = (Class) ((ParameterizedType) superType).getActualTypeArguments()[0];
        argClassMap.put(clazz, argClass);

        return argClass;
    }

}
