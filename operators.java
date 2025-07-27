/* 
1.Arithmatic operators
2.Unary operator
3.Assignment operator
4.Relational operator
5.Logical operator
6.Ternary operator  */

public class operators {
    public static void main(String[] args) {
        int a = 24;
        int b = 45;
        System.out.println("a + b ="+ (a+b));
        System.out.println("a - b ="+ (a-b));
        System.out.println("a * b ="+ (a*b)); 
        System.out.println("a % b ="+ (a%b));
        System.out.println("a / b ="+ (a/b));

    }
}
// output:
// a + b =69
// a - b =-21
// a * b =1080
// a % b =24
// a / b =0  

//        ASSIGNMENT OPERATORS
    /*   += , Add and Assign
      -= , subtract and assign
       *= , multiply and assign
      /= , divide and assign
      %= , modulo and assign   */


public class operators {
    public static void main(String[] args){
        int m = 3;
        System.out.println("m += 4" + (m+=4));
        System.out.println("m -= 4" + (m-=4));
        System.out.println("m *= 8" + (m*=4));
        System.out.println("m /= 4" + (m/=4));
        System.out.println("m %= 5" + (m%=5));
    }
}
// output:
// m += 47
// m -= 43
// m *= 812
// m /= 43
// m %= 53

//         RELATIONAL OPERATORS

/* == : Equal to.
   != : Not equal to.
   < : less than.
   <= : less than equal to.
   > : greater than.
   >= : greater than equal to. */

public class operators {
    public static void main(String[] args){
        int a = 45;
        float b = 34.45f;
        double c = 23d;
        System.out.println("a > b:" + (a > b));
        System.out.println("a >= b:" + (a >= b));
        System.out.println("a < c:" + (a < c));
        System.out.println("a <= b:" + (a <= b));
        System.out.println("a != c:" + (a !=c));

    }
}

/*output:
a > b:true
a >= b:true
a < c:false
a <= b:false
a != c:true  */ 


//           LOGICAL OPERATORS

/* && - logical AND: A.B
  || - logical OR: A + B
  ! - logical NOT: 
 */

 public class operators {
    public static void main(String[] args){
        boolean a = true;
        boolean b = false;
        System.out.println("a && b:" + (a && b));
        System.out.println("a || b:" + (a || b));
        System.out.println("!b:" + (!b));

    }
 }

//  output:
// a && b:false
// a || b:true
// !b:true


//         UNARY OPERATORS

/* 
 Unary operator requires only one operand.
 ++ - increment by 1.
      post-increment: uses value first,then increment.
      pre- increment: increses first,them uses the value.
--  - Decrement by 1:
      post-decrement: uses value first,then decrement.
      pre-decrement: decrements first,then uses values.
 */


 public class operators {
    public static void main(String[] args){
        int a = 23;
        int b = 34;
        System.out.println("postincrement:" + (a++));
        System.out.println("preincrement:" + (++a));
        System.out.println("postdecrement:" + (b--));
        System.out.println("predecrement:" + (--b));
    }
 }

// output:
// postincrement:23
// preincrement:25
// postdecrement:34
// predecrement:32

//           TERNARY OPERATORS
/*
The ternary operator is a shorthand version of the if - else statement
It has three operators and the name ternary.The general format is 
               condition ? if true : if false
if the condition evaluates true,then executes the statements after the '?' else executes
the statemnts after the ':'.
 */
public class operators {
    public static void main(String[] args){
        int num1 = 45, num2 = 32 , max;
        System.out.println("num1 is:" + num1);
        System.out.println("num2 is:" + num2);
        max = (num1 > num2) ? num1 : num2;
        System.out.println("max number is :" + max);
    }
}

// output:
// num1 is:45
// num2 is:32
// max number is :45