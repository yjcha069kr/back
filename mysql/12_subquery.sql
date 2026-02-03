/* 
    서브쿼리
        - 쿼리 안에서 실행되는 또 다른 쿼리
        - 서브쿼리는 반드시 ()로 감싼다.

        1. SELECT 절의 컬럼으로 사용 -> 스칼라 서브쿼리
        2. FROM 절의 테이블로 사용 -> 인라인 뷰
        3. WHERE 절의 값으로 사용 -> 서브쿼리
        4. GROUP BY 컬럼 HAVING 절의 값으로 사용
        
        SELECT 컬럼, ...
        FROM 테이블
        WHERE 컬럼 연산자 (
            SELECT 컬럼 
            FROM 테이블 
            [WHERE 조건]
        );
 */

-- 1. 평균 급여보다 급여(salary)가 높은 사원(emp_name)을 조회하시오.
SELECT AVG(salary)
FROM employee; -- 3875.0000

SELECT emp_name, salary
FROM employee
WHERE salary > (
    SELECT AVG(salary)
    FROM employee
);

/* 

 */
-- 2. 개발 또는 인사 부서에 속한 사원을 조회하시오.
-- IN: ~또는, ~중에 하나
-- IN ("개발", "인사")
SELECT emp_name
FROM employee
WHERE dept_id IN (10, 20);

SELECT dept_id
FROM department
WHERE dept_name IN ("개발", "인사");

SELECT dept_id
FROM department
WHERE dept_name IN ("개발", "인사");

-- 3. 인사 부서 사원 중 최소(MIN) 급여보다 급여가 높은 사원을 조회하시오.
-- 4. 인사 부서 사원 중 최대(MAX) 급여보다 급여가 높은 사원을 조회하시오.
SELECT * FROM employee;
INSERT INTO employee VALUES
(5, '김철수', 3700, 20),
(6, '안중근', 4600, 20),
(7, '한상진', 3200, 20);

SELECT MIN(salary) 
FROM employee;

SELECT dept_name, dept_id
FROM department
WHERE dept_id = 20;

-- 5. 사원이 존재하는 부서만 조회하시오.
-- 6. 사원이 없는 부서를 조회하시오.
-- 7. 각 사원의 급여와 전체 평균 급여를 함께 조회하시오.
-- 8. 부서별 평균 급여가 4000 이상인 부서를 조회하시오.
-- 9. 각 부서에서 평균 급여보다 많이 받는 사원을 조회하시오.
-- 10. 평균 급여보다 높은 사원을 JOIN 방식으로도 조회하시오.