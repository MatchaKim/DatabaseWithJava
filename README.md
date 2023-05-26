# DatabaseWithJava
자바 데이터베이스 연동 JDBC
<br></br>

## 🔍 개요

- MAC에서 이용할 수 없는 오라클 DB이용방법 JAVA 에서 Database를 조작하게 해주는 JDBC를 다룹니다.
<br></br><br></br>

## 💻 MAC에서의 오라클 DB 이용

- P) Mac에서는 오라클 DB를 지원하지 않는다.
- S) docker를 활용하여 오라클 DB를 이용할 수 있도록 만들어준다.
docker 를 설치한 후 colima를 통해 oracle sqlplus 를 실행한다.
<br></br><br></br>


## 📑 JAVA 에서 Database 조작 방법
 - 1) Oracle 웹사이트에서 Oracle JDBC 드라이버를 다운로드.  "ojdbc8.jar" 또는 "ojdbc10.jar" 파일.
 - 2) Libraries에 JAR 파일 추가
<br></br><br></br>

## 🤔 위 과정을 통해 JPA를 이용하는 이유를 알 수 있음
- 1) 복잡한 쿼리문 작성을 간소화
- 2) 객체와 관계형 데이터베이스 간의 매핑을 지원함
- 3) ddl auto를 통해 애플리케이션 실행 시 데이터베이스의 스키마 생성 및 수정을 자동으로 처리해줌
