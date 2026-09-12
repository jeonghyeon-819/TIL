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
- Java에서 문자 1개만 입력받을 수 없다. 항상 문자열 단위로 입력을 받아야 한다.
- 문자열은 String으로 sc.next()로 입력받을 수 있다.
    - 문자열 s의 첫 번째 문자는 s.charAt(0)으로 조회가 가능하기에, 이 과정을 거쳐 char 타입의 문자로 변환 가능
    - sc.next().charAt(0); 은 한 줄로 표현이 가능하다.
    - 예: String s = sc.next(); char c = s.charAt(0); System.out.println(c);
    - 예: char c = sc.next().charAt(0); System.out.prtinln(c);
- Java에서 문자열 1개 입력은 sc.next(); 를 사용하면 된다.

<br>

## 특정 문자를 사이에 두고 입력
- 두 수가 특정 문자를 사이에 두고 입력으로 들어오는 경우에는 전체를 하나의 문자열로 입력받고
- s.split(특정문자) 함수를 이용해 문자열을 특정 문자를 기준으로 나눈 뒤
- 각 값을 원소로 하는 배열을 받을 수 있다.
- 예: String s = sc.next(); String[] strArr = s.split(":"); System.out.println(strArr[0] + "\n" + strArr[1]);
- 문자열로 입력받고 숫자로 변환하는 방법
    - String s = sc.next();
    - String[] strArr = s.split(":");
    - int h = Integer.parseInt(strArr[0]);
    - System.out.print((h+1) + ":" + strArr[1]);
        - strArr[0] 즉, 문자를 입력받고
        - Integer.parseInt(strArr[0]) 을 통해 숫자로 변환
        - Integer.parseInt(strArr[0]) + 1 을 하면 숫자+1 가 된다. <br>
✓ 알게 된 부분 : strArr[0] + 1 을 하면 문자+1이 된다. <br>
✓ 알게 된 부분 : 출력할 때 . 마침표를 넣고 싶을 경우에는 "\\.' 로 해야한다.

<br>

### 특정 문자를 사이에 두고 3개 이상의 값을 입력
- "-" 문자를 사이에 두고 3개의 수를 입력받아 출력하는 코드 역시 s.split(특정문자) 를 이용하면 된다.
- 예: 입력 50-60-70
- 풀이 : String s = sc.next();
- 풀이 : String[] strArr = s.split("-");
- 풀이 : System.out.println(strArr[0] + "\n" + strArr[1] + "\n" + strArr[2]);
<br>
<br>
- 문제 풀이 참고
    - String year = scanner.next();
    - String[] days = year.split("-");
    - System.out.printf("%s.%s.%s", days[2], days[0], days[1]);

    - String[] s = scanner.next().split("-");
    - String mm = s[0];
    - String dd = s[1];
    - String yyyy = s[2];
    - System.out.println(yyyy + "." + mm + "." + dd);