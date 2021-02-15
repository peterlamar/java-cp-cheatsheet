public class Solution {

    public static void main(String[] args){
        Student obj = new Student();
        Class cls = obj.getClass();
        Method[] methods = cls.getDeclaredMethods();

        ArrayList<String> methodList = new ArrayList<>();
        for(int i=0; i<methods.length; i++){
            methodList.add(methods[i].getName());
        }
        Collections.sort(methodList);
        for(String name: methodList){
            System.out.println(name);
        }
    }

}