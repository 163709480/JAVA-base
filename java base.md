# java基础

> 理解概念+分析题目逻辑+多练习



### 流程控制语句

###### 顺序结构：代码按顺序执行

###### 分支结构：

**if**    		**进行判断**

```java
System.out.println("请输入");
        Scanner amount= new Scanner(System.in);
       int ip=amount.nextInt();
        if(ip>10){
            System.out.println("very good");
       }
        else {System.out.println("NONONO");}

    //if(9>4)
       // System.out.println("@22");
        boolean flag= false;
        if(flag){     //直接把变量写在里面
           System.out.println("falg");
```



**switch**语句格式

```java
switch(表达式){		//首先计算表达式的值 
    case 值1:		//依次和case后面的值进行比较，有对的执行
        语句体1;		//执行过程中，遇到break就会结束
        break;		  //如果都不匹配则执行default语句体
    case 值2;
        语句体2；
        break;
        ...
            default;
        	语句体n+1
             break;
}
default可以省略，语法不会有问题，但是不建议省略
```

> - ​	case穿透:语句体中没有写break导致
> - ​	如果多个case的语句体重复了，我们考虑利用case简化代码



###### 循环结构： 

- for

  ​	成员变量与局部变量

  > 求和的变量不能定义在循环的里面，因为变量只在所属的大括号中有效
  >
  > 当本次循环结束之后，变量就回从内存中小时
  >
  > 第二次循环开始的时候，又辉重新定义一个新的变量

  ```java
   int sum=0;//成员变量
          for (int i = 1; i <=5; i++) {
  //            System.out.println(i);
  
          //    int sum=0;//局部变量，每次执行循环都会让sum重置0
  
  
              sum+=i;
  
              System.out.println(sum);
          }
  //        System.out.println(amo);
      }
  
  ```




- ​	while

  ```java
  int heigh=0;
          double c=0.1;
          while (c<=8844430){//注意数字
              c=c*2;
              heigh++;// height+=1  height= height+1
          }
          System.out.println(heigh);
      }
  ```


​		





​		回文数联系  while循环

```java
 int number= sc.nextInt();//输入整数
    int extra=number; 把number暂存
    int sum=0;
    int fal=0;
    while (number!=0){
      sum=  number%10;//取余 得到个位数
      number=number/10; //除10 舍去个位
      fal=fal*10+sum;   //个位加到fal里面

    }
		//while循环结束number值已经改变不能与fal判断是否相同
        System.out.println(fal);
        System.out.println(extra==fal);
    }
```

```java
//不用除法和取余求除数和商
int ac=number;
    int extra= 2;
    int sum=0;
    int fal=0;
        System.out.println("2222");


    while (number>=extra){
        number=number-extra;

        sum++;

    }
        System.out.println(sum);//除数
        System.out.println(number);//商
        System.out.println("asdasdad");
    }
```

====	  			

> Random类：可以随机生成一个随机数
>
> 导包——》创建对象——》接受数据
>
> 

```java
		Random Ro= new Random();//生成随机数
        int c=Ro.nextInt(100)+1;//随机数范围 0~100
```





do..while



### 循环高级与数组

#### 	无限循环

###### 			==Continue==:结束本次循环



###### 			==break:==结束整个循环





### 数组

> - 数组指是一种容器，可以用来存储==同种数据结构==类型的多个值
> - 数组容器在存储数据时候，需要结合隐士转换考虑
> - 例如:double类型的数组容器(byte short int long float double)可
> - 建议：容器的类型，和存储数据类型保持一致

###### 数组的定义

```java
		int [] arr= {1,2,3,4,5};//
        System.out.println(arr[0]);//打印数组中第一个索引值
```

