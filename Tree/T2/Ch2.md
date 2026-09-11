# 입출력

<br>

## 정수 입력
- Java에서는 Scanner를 이용해 입력을 받을 수 있다.
- Scanner를 사용하기 위해서는 import java.util.Scanner; 를 적어야 한다.
- main 함수 안에는 꼭 Scanner sc = new Scanner(System.in); 을 적어야 한다.
- 하나의 정수를 입력 받기 위해서는 sc.nextInt()를 사용하면 된다.

<br>

## 실수 입력
- 실수 type를 입력받기 위해서는 실수 type인 double 변수를 선언한 뒤 sc.nextDouble() 을 이용해 입력을 받아야 한다. <br>
✓ 헷갈린 부분 : 소수점을 출력하기 위해서는 System.out.printf("%.?f, ?); 를 사용해야 한다.

<br>

## 공백을 사이에 두고 입력
- 공백을 사이에 두고 두 개의 수를 입력받고 싶다면 Scanner 를 이용해 두 개의 정수형 변수에 입력을 받아주면 된다.
- sc.nextInt() 는 공백 단위로 입력을 받아주기 때문에 공백을 무시한 채 두 개의 숫자만을 입력받을 수 있다.
- 예 : int a = sc.nextInt(); int b = sc.nextInt(); -> 13 17 입력하면 된다.

<br>

## 2개의 줄에 걸쳐 입력
- Java에서는 System.nextInt() 를 통해 입력을 받으면 줄을 바꿔주는 \n 역시 공백과 마찬가지로 입력에서 무시된다.
- 즉, 두 줄에 걸쳐 입력을 받는 경우 앞에서 했던 공백을 끼고 입력하는 것과 똑같이 입력을 받는다. <br>
✓ 알게 된 부분 : System.out.printf("%.3f\n", a); 이렇게 하면 a 출력하고 한 줄 띄울 수 있다.

<br>

## 문자, 문자열 입력
- 

<br>

## 특정 문자를 사이에 두고 입력