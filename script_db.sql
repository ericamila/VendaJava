CREATE DATABASE faturacao
    WITH
    OWNER = postgres
    ENCODING = 'UTF8'
    LC_COLLATE = 'Portuguese_Brazil.1252'
    LC_CTYPE = 'Portuguese_Brazil.1252'
    LOCALE_PROVIDER = 'libc'
    TABLESPACE = pg_default
    CONNECTION LIMIT = -1
    IS_TEMPLATE = False;
	
	CREATE TABLE IF NOT EXISTS public.clientes
(
    idcliente character varying(12) COLLATE pg_catalog."default" NOT NULL,
    idtipo integer,
    nomes character varying(30) COLLATE pg_catalog."default" NOT NULL,
    snome character varying(30) COLLATE pg_catalog."default" NOT NULL,
    endereco character varying(50) COLLATE pg_catalog."default",
    telefone character varying(20) COLLATE pg_catalog."default",
    idcidade integer,
    datanascimento date,
    datacadastro date,
    CONSTRAINT clientes_pkey PRIMARY KEY (idcliente)
);

CREATE TABLE IF NOT EXISTS public.usuarios
(
    idusuario character varying(10) COLLATE pg_catalog."default" NOT NULL,
    nome character varying(30) COLLATE pg_catalog."default" NOT NULL,
    snome character varying(30) COLLATE pg_catalog."default" NOT NULL,
    senha character varying(30) COLLATE pg_catalog."default" NOT NULL,
    idperfil smallint,
    CONSTRAINT usuarios_pkey PRIMARY KEY (idusuario)
);

CREATE TABLE IF NOT EXISTS public.produtos
(
    idproduto character varying(12) COLLATE pg_catalog."default" NOT NULL,
    descricao character varying(50) COLLATE pg_catalog."default" NOT NULL,
    preco integer,
    idimposto integer,
    notas character varying(100) COLLATE pg_catalog."default" NOT NULL,
    CONSTRAINT produtos_pkey PRIMARY KEY (idproduto)
);

CREATE TABLE IF NOT EXISTS public.fatura
(
    idfatura integer NOT NULL,
    idcliente character varying(12) COLLATE pg_catalog."default" NOT NULL,
    data date,
    CONSTRAINT fatura_pkey PRIMARY KEY (idfatura)
);

CREATE TABLE IF NOT EXISTS public.detalhefatura
(
    idfatura integer NOT NULL,
    idlinha integer NOT NULL,
    idproduto character varying(12) COLLATE pg_catalog."default" NOT NULL,
    descricao character varying(50) COLLATE pg_catalog."default" NOT NULL,
    preco integer NOT NULL,
    quantidade integer NOT NULL,
    CONSTRAINT detalhefatura_pkey PRIMARY KEY (idfatura, idlinha)
)

