Feature: Login
  COMO usuario del NUBI
	QUIERO conectarme a la aplicación
	PARA verificar el correcto funcionamiento de la pantalla de login

	@Regresion
	Scenario Outline: NUBI - Login exitoso
	  Given el usuario esta en el portal de nubi backoffice
		When se ingresa usuario: '<usuario>' y clave: '<clave>'
		Then el usuario visualiza correctamente la pantalla de Inicio de NUBI

		Examples:
		|usuario 											 |clave 	 |
		|martin.marussi+3@wolox.com.ar |Nubi2020 |      
      
      
  @Regresion
	Scenario Outline: NUBI - Login incorrecto
		Given el usuario esta en el portal de nubi backoffice 
		When se ingresa usuario: '<usuario>' y clave: '<clave>'
		Then el usuario visualiza un mensaje de '<mensaje>'
		
		Examples: 
      |usuario 		|clave 	|mensaje											|
      |fakeUser1	|clave 	|usuario o contraseña inválida|



