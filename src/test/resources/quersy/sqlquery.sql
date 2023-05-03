select * from employees;
select first_name from employees;
select first_name,last_name, salary from employees;
select distinct first_name from employees;
select department_id from EMPLOYEES;
-- distinct based provided column
select *from EMPLOYEES
where first_name='David';
--value lerde case sensetive david yok David var mesela
select  first_name,LAST_NAME,salary from employees
where FIRST_NAME='David' and LAST_NAME='Austin';
--and kullandigimiz icin iki valuede valid olmali
select * from EMPLOYEES
where SALARY>3000 and DEPARTMENT_ID=10;
--jenefer sadece onun id si 10
select * from EMPLOYEES
where SALARY>3000 and SALARY<=8000;
select * from EMPLOYEES
where SALARY between 3000 and 8000;
select * from EMPLOYEES
where EMPLOYEE_ID between 100 and 150;
--ilk degerin diger degerden kucuk olmasi lazimmmis
select * from EMPLOYEES
where JOB_ID='IT_prog' or JOB_ID= 'MK_MAN';
select * from EMPLOYEES
where JOB_ID not in('IT_PROG', 'MK_MAN');
select * from EMPLOYEES
where MANAGER_ID is null;
--1 result sten king
select * from EMPLOYEES
where MANAGER_ID is not null;
--order according to from high salary to low salary Asc Order
select * from EMPLOYEES
order  by salary asc;
--otomaticly give same result without desc
select * from EMPLOYEES
order  by salary desc ;
--order from z-a desc means duserek azalarak sirala
select * from EMPLOYEES
order  by FIRST_NAME desc;
--like is beging startwith A example
select * from EMPLOYEES
where FIRST_NAME like 'A%';
--4 letters name adam for example
select * from EMPLOYEES
where FIRST_NAME like 'A___';
--end of name is m param example
select * from EMPLOYEES
where FIRST_NAME like '____m';
--contains IT letters
select * from EMPLOYEES
where JOB_ID like '%IT%';
--row count gives us ,is not count null
--23 kisinin departman number varmis
select * from EMPLOYEES
select count(*) from LOCATIONS;
--just 1 person does not have departmanID
select count(*)  from EMPLOYEES
where DEPARTMENT_ID is null;
--100 people there is on the table
select first_name from EMPLOYEES;
--91 diffrent names are there on the table
select count(distinct first_name)  from EMPLOYEES;
select max(salary) from EMPLOYEES;
select min(salary) from EMPLOYEES;
select avg(salary) from EMPLOYEES;
---6462 bu yuvarlanmis hali
select round(avg(salary)) from EMPLOYEES;
--6462.83 noktadan sonraki iki basamak dahil ediliyo
select round(avg(salary),2) from EMPLOYEES;
--IT_PROG daki kislerin salary avg i 5760
select avg(salary) from EMPLOYEES
where JOB_ID='IT_PROG';
--job id sine gore alarinda avg ni aliyo her jobin avarage i

select JOB_ID ,avg(salary) from EMPLOYEES
group by JOB_ID;

--job gruplarininin avg ,max,min,
select JOB_ID ,avg(salary),max(salary) ,min(salary) ,count(*) , avg(salary) from EMPLOYEES
group by JOB_ID
order by count(*) desc ;

select DEPARTMENT_ID ,avg(salary),max(salary) ,min(salary) ,count(*) , avg(salary) from EMPLOYEES
group by DEPARTMENT_ID
order by count(*) desc ;
--grup departmen id ye gore siraliyo
select DEPARTMENT_ID ,avg(salary),max(salary) ,min(salary) ,count(*) , avg(salary) from EMPLOYEES
group by DEPARTMENT_ID
order by DEPARTMENT_ID desc ;
--having diplay depertamn id average salary is more than 5K
select DEPARTMENT_ID ,avg(salary),max(salary) ,min(salary) ,count(*) , avg(salary) from EMPLOYEES
where DEPARTMENT_ID is not null
group by DEPARTMENT_ID
having avg(SALARY)>5000
order by avg(SALARY) desc ;
select DEPARTMENT_ID,count(*) from EMPLOYEES
group by DEPARTMENT_ID
having count(*)>5;
--display duplicated (more than one) firstnames from employees table
select FIRST_NAME,count(*) from EMPLOYEES
group by FIRST_NAME
having count(*)>1
order by count(*) desc ;



