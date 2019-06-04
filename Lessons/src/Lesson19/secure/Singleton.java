package Lesson19.secure;

import java.lang.reflect.ReflectPermission;
import java.security.Permission;

/**
 *
 */
public final class Singleton {

    static {
        System.setSecurityManager(new SecurityManager() {
            @Override
            public void checkPermission(Permission permission) {
                if (permission instanceof ReflectPermission
                        && "suppressAccessChecks".equals(permission.getName())) {
                    for (StackTraceElement elem : Thread.currentThread().getStackTrace()) {
                        if ("java.lang.reflect.AccessibleObject".equals(elem.getClassName())
                                && "setAccessible".equals(elem.getMethodName())) {
                            throw new SecurityException();
                        }
                    }
                }
            }
        });
    }

    private static volatile Singleton singleton;

    private Singleton() {
    }

    public static synchronized Singleton getInstance() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }

}