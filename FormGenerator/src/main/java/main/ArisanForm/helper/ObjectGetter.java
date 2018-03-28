package main.ArisanForm.helper;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.logging.Logger;

/**
 * Created by wijaya on 3/28/2018.
 */
public class ObjectGetter {
    public static Object runGetter(Field field,Object obj)
    {
        Class<Object> o = (Class<Object>) obj.getClass();
        // MZ: Find the correct method
        for (Method method : o.getMethods())
        {
            if ((method.getName().startsWith("get")) && (method.getName().length() == (field.getName().length() + 3)))
            {
                if (method.getName().toLowerCase().endsWith(field.getName().toLowerCase()))
                {
                    // MZ: Method found, run it
                    try
                    {
                        return method.invoke(o);
                    }
                    catch (IllegalAccessException e)
                    {

                    }
                    catch (InvocationTargetException e)
                    {

                    }

                }
            }
        }


        return null;
    }
}
