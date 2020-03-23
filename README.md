# demo-backend-registro-clientes
Demo de ejercicio realizado en SpringBoot
Base de datos en Postgresql
Para el calculo de posible fecha de defuncion se tomo la edad promedio sacada de las encuestas en Peru ,con un promedio de edad aproximada de 76 años.

Consulta de clientes,edad promedio,desviacion estandar - Jpa,swagger,bean validation

Desplegado en AWS usando el servicio de Elastic Beanstalk - Postgresql RDS

Desplegado en Heroku para su uso como segunda opcion.

AWS endpoints

POST: http://joaquin-registro-rest.us-east-2.elasticbeanstalk.com:8080/v1/creacliente

GET: http://joaquin-registro-rest.us-east-2.elasticbeanstalk.com:8080/v1/listclientes

GET: http://joaquin-registro-rest.us-east-2.elasticbeanstalk.com:8080/v1/kpideclientes

Heroku

GET: https://demo-backend-registro.herokuapp.com/v1/listclientes

GET: https://demo-backend-registro.herokuapp.com/v1/kpideclientes

POST: https://demo-backend-registro.herokuapp.com/v1/creacliente

autor - Joaquin Huauya
