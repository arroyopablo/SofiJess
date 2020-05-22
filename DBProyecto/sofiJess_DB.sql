CREATE TABLE Proveedor(
 nombreProv           varchar(50),
 nitProv              bigint NOT NULL PRIMARY KEY,
 telProv              bigint  NOT NULL,
 dirProv              varchar(50) NOT NULL);
 
 INSERT INTO Proveedor VALUES('Jose',1077,316682357,'Cr39fdf');
 select * from Proveedor;
 
CREATE TABLE Producto(
 nombreProduc         varchar(50) NOT NULL,
 codigoProduc         bigint NOT NULL PRIMARY KEY,
 precioCompraProduc   numeric(12,0) NOT NULL,
 precioVentaProduc 	  numeric(12,0) NOT NULL,
 descripcionProduc    varchar(150),
 cantidadProduc       bigint NOT NULL,
 nitProv              bigint NOT NULL,	
CONSTRAINT  fknitProv FOREIGN KEY(nitProv) REFERENCES Proveedor(nitProv));

INSERT INTO Producto VALUES('Teclado',1,25000,28000,'Teclado nuevo',10,1077);
INSERT INTO Producto VALUES('Mouse',2,20000,23000,'Mouse nuevo',10,1077);

 select * from producto;
 
CREATE TABLE Empleado(
 usuarioEmple           varchar(50) NOT NULL,
 contrasenaEmple        varchar(50) NOT NULL,
 nombreEmple            varchar(50) NOT NULL,
 apellidoEmple          varchar(50),
 cedulaEmple            bigint NOT NULL PRIMARY KEY,
 telefono               bigint NOT NULL,
 direccionEmple         varchar(60) NOT NULL,
 barrioEmple            varchar(50),
 sueldo                 numeric(12,0) NOT NULL,
 cargo     varchar(50) NOT NULL DEFAULT 'Empleado' CHECK(cargo IN('Jefe','Empleado')));
 
 INSERT INTO Empleado VALUES
 ('ROOT3','eccbc87e4b5ce2fe28308fd9f2a7baf3','Admin','y',20,315,'cr 11 #12bis-22','Porvenir',1000,'Jefe');
 INSERT INTO Empleado VALUES
 ('empleado','eccbc87e4b5ce2fe28308fd9f2a7baf3','testEmpleado','x',10,314,'cr 11 #12bis-22','Porvenir',1000,'Empleado');
 
 
 select * from empleado;
 
 
CREATE TABLE Cliente(
 nombreClien           varchar(50) NOT NULL,
 apellidoClien         varchar(50) NOT NULL,
 cedulaClien           bigint NOT NULL PRIMARY KEY,
 telefonoClien         bigint NOT NULL,
 direccionClien        varchar(60) NOT NULL,
 barrioClien           varchar(50),
 correoElectro         varchar(80) NOT NULL);
 
 INSERT INTO Cliente VALUES
 ('Alejandro','Rodriguez',980,316,'cr39','colon','alejandro@gmail.com');
 INSERT INTO Cliente VALUES
 ('Reinel','Mendoza',100,316,'cr39','colon','reinel@gmail.com');
 
 select * from cliente;
 
CREATE TABLE  Cotizacion(
 idCotizacion              serial PRIMARY KEY ,
 cedulaClien               bigint NOT NULL,
 cedulaEmple               bigint NOT NULL,	
 fechaC                    date DEFAULT CURRENT_DATE,
 totalCompra               numeric(12,0) NOT NULL DEFAULT 0,
CONSTRAINT fkcedulaClien FOREIGN KEY(cedulaClien) REFERENCES Cliente(cedulaClien),
CONSTRAINT fkcedulaEmple FOREIGN KEY(cedulaEmple) REFERENCES Empleado(cedulaEmple));

INSERT INTO Cotizacion(cedulaClien,cedulaEmple) VALUES
 (980,20),
 (100,20);
 
 
 select * from cotizacion;

CREATE TABLE DetalleCotizacion(
 idDetalle              serial PRIMARY KEY,
 idCotizacion           bigint  NOT NULL,
 codigoProduc           bigint  NOT NULL,
 cantidad               bigint  NOT NULL,
 valorunitario          numeric(12,0)NOT NULL,
 iva              	    numeric(12,0)NOT NULL,
 total                  numeric(12,0)NOT NULL,
CONSTRAINT fkidCotizacion FOREIGN KEY(idCotizacion) REFERENCES Cotizacion(idCotizacion),
CONSTRAINT fkcodigoProducCot FOREIGN KEY(codigoProduc) REFERENCES Producto(codigoProduc));

INSERT INTO DetalleCotizacion(idCotizacion,codigoProduc,cantidad,valorunitario,iva,total) VALUES
 (1,1,3,25000,4750,89250),
 (2,2,3,20000,3800,86400),
 (2,1,1,25000,4750,29740);
 
select * from detalleCotizacion;

CREATE VIEW producto_proveedor AS
SELECT * FROM Producto NATURAL JOIN Proveedor;


