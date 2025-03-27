Feature: Creacion de Candidatos en la Interfaz de Usuario (UI)

Background:
  Given Estoy en la pagina candidato "http://localhost:4200/candidatos"

@candidateTest
Scenario: Craeacion de un candidato con datos validos 
  When Hago clic en el botón de crear candidato
  And Relleno los campos del formulario con "<nombre>", "<apellido>", "<cedula>", "<fecha_nacimiento>", "<fecha_registro>", "<celular>", "<ciudad>", y "<email>"
  
  Then veo los datos correctos del candidato con cedula: "<cedula>"

 Examples:

| nombre| apellido| cedula| fecha_nacimiento | fecha_registro| celular| ciudad| email|
|Jose Miguel|Gonzalez Pinto|1058796655|1999-10-15|2025-03-26|3152268975|Bogota|Jose.pinto@example.com| 
|Maria|Lopez|1058796656|1990-05-20|2025-03-27|3152268976|Medellin|maria.lopez@example.com|
|Carlos|Perez|1058796657|1985-08-12|2024-03-28|3152268977|Cali|carlos.perez@example.com|
|Ana|Martinez|1058796658|1992-11-30|2024-03-29|3152268978|Barranquilla|ana.martinez@example.com|
|Luis|Ramirez|1058796659|1988-03-15|2024-03-30|3152268979|Cartagena|luis.ramirez@example.com|
|Sofia|Gomez|1058796660|1995-07-25|2024-03-31|3152268980|Manizales|sofia.gomez@example.com|
|Jorge|Hernandez|1058796661|1983-09-10|2024-04-01|3152268981|Pereira|jorge.hernandez@example.com|
|Laura|Vargas|1058796662|1997-01-05|2024-04-02|3152268982|Bucaramanga|laura.vargas@example.com|
|Andres|Castro|1058796663|1986-06-18|2024-04-03|3152268983|Santa Marta|andres.castro@example.com|
|Camila|Diaz|1058796664|1993-02-22|2024-04-04|3152268984|Ibague|camila.diaz@example.com|
|Felipe|Morales|1058796665|1989-12-14|2024-04-05|3152268985|Cucuta|felipe.morales@example.com|




