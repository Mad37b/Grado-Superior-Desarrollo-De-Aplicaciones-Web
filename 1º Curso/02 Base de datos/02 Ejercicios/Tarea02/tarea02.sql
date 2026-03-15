CREATE TABLE Productos (Codproducto NUMBER(5) PRIMARY KEY,Denoproducto VARCHAR2(20) UNIQUE,
Descripción VARCHAR2(100),PrecioBase NUMBER(8,2) NOT NULL CHECK (PrecioBase > 0),PorcReposición NUMBER(3) CHECK (PorcReposición > 0),
UnidadesMínimas NUMBER(4) NOT NULL CHECK (UnidadesMínimas >0), Codfamilia NUMBER(3)NOT NULL, FOREIGN KEY(Codfamilia) REFERENCES Familia(Codfamilia));

CREATE TABLE Familia ( Codfamilia NUMBER(3)PRIMARY KEY,Denofamilia VARCHAR2(50) NOT NULL UNIQUE);

CREATE TABLE Tienda (Codtienda NUMBER(3) PRIMARY KEY, Denotienda VARCHAR2(20) NOT NULL, Telefono VARCHAR2(11),CodigoPostal Varchar2(5) NOT NULL, Provincia VARCHAR2(5)NOT NULL );


CREATE TABLE Stock (Codtienda NUMBER(3)NOT NULL,FOREIGN KEY (Codtienda) REFERENCES Productos(Codtienda),Codproducto NUMBER(5)NOT NULL,FOREIGN KEY (Codproducto) REFERENCES Productos(Codproducto));
