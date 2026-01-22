-- SQL 표준 주석
# MySQL 주석
-- ctrl+enter: 커서가 있는 문장 실행 또는 블록 설정한 여러 문장 실행
-- 문장 끝은 세미콜론(;)
CREATE SCHEMA `mydb` DEFAULT CHARACTER SET utf8mb4 ;
USE mydb;

/*
	DB 구축: DDL
		1. 사용자 정의: root, yj
			- 아이디, 패스워드, 권한 설정(DBA)
        2. 스키마 생성 - DB
        3. 테이블 생성
			- 열(속성 정의)
			
            CREATE TABLE 테이블명 (
				컬럼 데이터타입1 [제약조건],
				컬럼 데이터타입2 [제약조건],
                ...
            );
            
            테이블/컬럼 이름규칙
				1. 영문자, 숫자, _
                2. 첫 글자는 숫자x
                3. 최대 길이는 64자
                4. 예약어x (단, ``로 묶으면 예약어도 사용 가능하지만 권장하지 않음)
                5. 윈도우 시스템에서는 대소문자 구분x (구분하는 시스템도 있음. 예: Linux)
                6. 테이블명은 복수로, 필드명은 단수로 씀 (관례)
                7. 소문자, 스네이크 표기법 (관례)
                
			데이터 타입
				1. 숫자
					INT: 정수
                    BIGINT: 큰 정수
                    DECIMAL(p,s): 금액, 정확한 소수
                2. 문자
					CHAR(n): 고정 길이, 예) 주번-13자
                    VARCHAR(n): 가변 길이, 예) 이름- 2자, 3자, ~
                    TEXT: 대용량 문자열
                3. 날짜/시간
					DATETIMEL 로컬 시간
                    TIMESTAMP: UTC 기준
                4. 불리언
					BOOLEAN -> TINYINT(1)
                5. 이진 데이터: 이미지, 동영상 등
					TINYBLOB: 255B
					BLOB: 64KB - 작은 아이콘, 설정 파일
                    MEDIUMBLOB: 16MB - 일반 이미지
                    LONGBLOB: 4GB - 고화질 이미지, 동영상
                    
			제약 조건
				1. NOT NULL: 빈 값(NULL)을 허용하지 않음 -> 필수입력
                2. UNIQUE: 중복값 허용x -> 유일성(UQ), 단, NULL은 적용
                3. PRIMARY KEY: 기본키(PK)
                4. FOREIGN KEY: 외래키(FK)
                5. CHECK
                6. DEFAULT
                
			기타 속성
				1. AUTO_INCREMENT: 자동으로 1씩 증가(1, 2, 3, ...)
            
*/
-- 1. 회원 정보를 저장하는 member 테이블을 생성하시오.
-- 윈도우 시스템에서 MySQL은 대소문자 구별 안함
-- 명령어는 대문자로(관례)
CREATE TABLE  `member` (
	member_id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(50),
    age INT,
    gender CHAR(1),
    regdate DATE
);

-- 2. 이름(product_name)은 필수 입력인 product 테이블을 생성하시오.
-- 3. 조회수(view_cnt) 기본값이 0인 board 테이블을 생성하시오.
-- 4. 이메일(email)이 중복되지 않는 user 테이블을 생성하시오.
-- 5. 주문 테이블을 생성하고 회원 테이블을 참조하도록 설정하시오.
-- 6. member 테이블에 phone 컬럼을 추가하시오.
-- 7. member 테이블의 name 컬럼 길이를 100으로 변경하시오.
-- 8. member 테이블의 phone 컬럼명을 mobile로 변경하시오.
-- 9. member 테이블에서 age 컬럼을 삭제하시오.
-- 10. member 테이블의 email 컬럼에 UNIQUE 제약조건을 추가하시오.
-- 11. email UNIQUE 제약조건을 삭제하시오.
-- 12. member 테이블 이름을 customer로 변경하시오.
-- 13. product 테이블을 삭제하시오.
-- 14. board 테이블의 모든 데이터를 삭제하시오.
-- 15. member 테이블 구조와 데이터를 복사하여 member_backup 테이블을 생성하시오.