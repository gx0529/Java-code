import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class BeanOperation {
    private BeanOperation(){}
    public static void setBeanValue(Object actionObj, String value) throws Exception{
        //emp.name:dange|emp.job:Linux
        //1.进行字符串拆分
        String[] temp = value.split("\\|");
        //emp.name:dange
        //emp.job:Linux
        for(int i=0; i<temp.length; i++){
            String[] result = temp[i].split(":");
            //emp.name
            //dange
            //取得真实要设置的内容
            String realValue = result[1];
            //取得要设置的真实类名称
            //emp
            String realClassName = result[0].split("\\.")[0];
            //取得要设置的属性名称
            //name
            String attrName = result[0].split("\\.")[1];
            //通过反射取得xxAction中的真实对象
            Object realObj = getRealObject(actionObj,realClassName);
            //1.取得emp对象
            Class<?> cls = realObj.getClass();
            //2.拼装setter方法名称
            String setName = "set" + initCap(attrName);
            Method setMethod = cls.getDeclaredMethod(setName,String.class);
            setMethod.invoke(realObj,realValue);
        }
    }

    /**
     * 取得真实操作的类对象
     * @param actionObj
     * @param realClassName
     *      * @return
     */
    private static Object getRealObject(Object actionObj, String realClassName){
        //取得action对象的Class对象
        Class<?> cls = actionObj.getClass();
        //拼装getEmp方法名
        String methodName = "get"+initCap(realClassName);
        Object realObj = null;
        //取得Method对象
        try {
            //取得getEmp的Method对象
            Method method = cls.getDeclaredMethod(methodName);
            //相当于调用了empAction.getEmp();
            try {
                realObj = method.invoke(actionObj);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        return realObj;
    }
    public static String initCap(String str){
        return str.substring(0,1).toUpperCase()+str.substring(1);
    }
}
