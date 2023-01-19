create table PRINCING_Modelos (
	uuid_ VARCHAR(75) null,
	id_ LONG not null primary key,
	modeloName VARCHAR(75) null
);

create table PRINCING_Pricing (
	uuid_ VARCHAR(75) null,
	id_ LONG not null primary key,
	firstName VARCHAR(75) null,
	lastName VARCHAR(75) null,
	carModel VARCHAR(75) null,
	identityDocument VARCHAR(75) null,
	sucursal VARCHAR(75) null,
	department VARCHAR(75) null,
	province VARCHAR(75) null,
	productType VARCHAR(75) null,
	productModel VARCHAR(75) null,
	productVersion VARCHAR(75) null,
	contactChannel VARCHAR(75) null,
	phone VARCHAR(75) null,
	clientType VARCHAR(75) null,
	email VARCHAR(75) null
);