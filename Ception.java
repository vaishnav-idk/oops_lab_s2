class invalidageException extends Exception
{
    public invalidageException(String n)
    {
      super(n) ; 
    }


}

class invalidageExceptiony extends Exception
{
    public invalidageExceptiony(String n)
    {
      super(n) ; 
    }


}

class Ception
{
    public  static void test(int n) throws Exception
    {
        
         if(n < 18 || n>60)
         {
            if(n<18)
            throw new invalidageExceptiony("too young");
            else
            throw new invalidageExceptiony("too old");
         }

        
    }



public static void main(String[] args) {
    try{
        test(61);

    }

    catch(Exception e)
    {
        System.out.println("caught execption"+e);
        return;
    }
System.out.println("valid age");
    
}
}