insert into country (name) values('Estonia');
insert into country (name) values('Finland');
insert into country (name) values('Germany');
insert into country (name) values('Danemark');
insert into country (name) values('France');
insert into country (name) values('Spain');
insert into country (name) values('Brazil');
insert into country (name) values('BrazilLLL');
--commit;
select * from country;
--delete from country;

insert into address (city,street , house, zip, country_id)
values('Tartu', 'Pikk', '12', 11158, 4);
insert into address (city, street, house, zip, country_id)
values('Helsinki', 'Soo', '55', 11858,
       (select id from country where name = 'Finland')
      );
insert into address (city, street, house, zip, country_id)
values('Tallinn', 'Pikk', '47', 11758,
       (select id from country where name = 'Estonia')
      );
insert into address (city, street, house, zip, country_id)
values('Kopenhagen', 'Malmo', '9', 11758,
       (select id from country where name = 'Danemark')
      );
insert into address (city,     street,    house,  zip,                 country_id                        )
values(             'Paris', 'La street', '77',  15558, (select id from country where name = 'France')
      );




select * from address;

--Clients:
---------------------------------------------------------------------------------------------------

insert into client (   name,   last_name, year_of_birth,                address_id)
values(               'Mik', 'Mihkelson',    1988,        (select id from address where city = 'Helsinki'));


insert into client (name, last_name, year_of_birth, address_id)
values('Robert', 'Laev', 2004, (select id from address where city = 'Tartu'));

insert into client (name, last_name, year_of_birth, address_id)
values('Will', 'Smith', 1945, (select id from address where city = 'Paris'));

insert into client (name, last_name, year_of_birth, address_id)
values('Margo', 'Robbie', 1984, (select id from address where city = 'Kopenhagen'));

insert into client (name, last_name, year_of_birth, address_id)
values('Max', 'Power', 1977, (select id from address where city = 'Tallinn'));



--Selects and Joins:
---------------------------------------------------------------------------------------------------
select * from client;
select * from address;
select * from country;

--want to see all clients with cities:
select cl.name as name, cl.last_name as last_name, ad.city as city
from client cl
left join address ad on cl.address_id = ad.id;

--want to see a client report: name, last_name, year, city, street, house
select 
 cl.name as name, cl.last_name as last_name, cl.year_of_birth as year,
 ad.city as city, ad.street as street, ad.house as house
 from client cl join address ad 
 on cl.address_id = ad.id;

 --want to see a client report: name, last_name, year, country

 select
/* cl.name,
 cl.last_name,
 cl.year_of_birth as year,
 cn.name*/

 *
 from client cl
 left join address ad on cl.address_id = ad.id
 right join country cn on ad.country_id = cn.id
 ;

 --- RIGHT JOIN:
 select * from address ad
 RIGHT JOIN country cn
 ON ad.country_id = cn.id
 ;

  --- LEFT JOIN:
 select * from address ad
 LEFT JOIN country cn
 ON ad.country_id = cn.id
 ;

   --- FULL OUTER JOIN:
 select * from address ad
FULL OUTER JOIN country cn
 ON ad.country_id = cn.id
 ;

 --- UPDATE SQLs
UPDATE country SET population = 1350000
where name = 'Estonia'
;
UPDATE country SET population = 5500000
where name = 'Finland'
;
UPDATE country SET population = 83100000
where name = 'Germany'
;
select * from country;

select
--*
cl.name, cl.last_name
from client cl
LEFT JOIN address ad ON cl.address_id = ad.id
LEFT JOIN country cn ON ad.country_id = cn.id
--where cn.name = 'Estonia' OR  cn.name = 'Finland' OR cn.name = 'France'
where cn.name IN ('Estonia', 'Finland', 'France')
;

select * from address where city = 'Helsinki';

SELECT * FROM address where city = 'Helsinki' OR 'a'='a';
SELECT * FROM address where city = 'X' OR 'a'='a';






