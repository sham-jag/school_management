--
-- PostgreSQL database dump
--

-- Dumped from database version 12.7
-- Dumped by pg_dump version 12.7

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

SET default_tablespace = '';

SET default_table_access_method = heap;

--
-- Name: class; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.class (
    id integer NOT NULL,
    section character varying(2) NOT NULL,
    teacherid integer
);


ALTER TABLE public.class OWNER TO postgres;

--
-- Name: class_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

ALTER TABLE public.class ALTER COLUMN id ADD GENERATED ALWAYS AS IDENTITY (
    SEQUENCE NAME public.class_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1
);


--
-- Name: student; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.student (
    id integer NOT NULL,
    fname text NOT NULL,
    lname text NOT NULL,
    gender character varying(1),
    dob character varying(15) NOT NULL,
    phone character varying(10),
    address character varying(200) NOT NULL,
    classid integer
);


ALTER TABLE public.student OWNER TO postgres;

--
-- Name: student_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

ALTER TABLE public.student ALTER COLUMN id ADD GENERATED ALWAYS AS IDENTITY (
    SEQUENCE NAME public.student_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1
);


--
-- Name: subject; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.subject (
    id integer NOT NULL,
    name text
);


ALTER TABLE public.subject OWNER TO postgres;

--
-- Name: subject_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

ALTER TABLE public.subject ALTER COLUMN id ADD GENERATED ALWAYS AS IDENTITY (
    SEQUENCE NAME public.subject_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1
);


--
-- Name: teacher; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.teacher (
    id integer NOT NULL,
    fname text NOT NULL,
    lname text NOT NULL,
    gender character varying(1),
    dob character varying(15) NOT NULL,
    phone character varying(10),
    address character varying(200) NOT NULL,
    subjectid integer
);


ALTER TABLE public.teacher OWNER TO postgres;

--
-- Name: teacher_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

ALTER TABLE public.teacher ALTER COLUMN id ADD GENERATED ALWAYS AS IDENTITY (
    SEQUENCE NAME public.teacher_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1
);


--
-- Data for Name: class; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.class (id, section, teacherid) FROM stdin;
1	A	2
2	B	5
3	C	1
\.


--
-- Data for Name: student; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.student (id, fname, lname, gender, dob, phone, address, classid) FROM stdin;
1	SHAMBHAVI	J	F	27-06-2000	6362497458	BANGALORE	1
2	PRAJWAL	V	M	30-04-2000	9563021845	BANGALORE	3
3	SUPRITHA	RS	F	01-11-1999	8765021498	BANGALORE	2
4	VACHANA	V	F	03-06-2000	9963147852	BANGALORE	1
5	NISCHITHA	RAGI	F	28-08-2001	8974503112	BANGALORE	3
6	VINAYAK	M	M	17-02-2000	9745201300	BANGALORE	2
7	SUMUKHA	KASHYAP	M	04-12-2000	9745212040	BANGALORE	2
8	BHAVANA	S	F	19-05-2000	9942013584	BANGALORE	2
10	YASHAS	V	M	25-03-2000	7730101589	BANGALORE	1
9	KRISHNA	M	M	06-09-2000	7563021589	BANGALORE	1
\.


--
-- Data for Name: subject; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.subject (id, name) FROM stdin;
1	MATHS
2	SCIENCE
3	SOCIAL
4	ENGLISH
5	KANNADA
6	\N
\.


--
-- Data for Name: teacher; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.teacher (id, fname, lname, gender, dob, phone, address, subjectid) FROM stdin;
1	HEMA	R	F	09-07-1972	9631587420	BANGALORE	5
2	MURALI	V	M	14-03-1969	9972301654	BANGALORE	1
3	ASHOK	KUMAR	M	22-11-1978	8850316247	BANGALORE	4
4	SUMA	REDDY	F	07-01-1973	7013649258	BANGALORE	2
5	SHOBHA	T	F	30-04-1970	6520318436	BANGALORE	3
\.


--
-- Name: class_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.class_id_seq', 3, true);


--
-- Name: student_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.student_id_seq', 10, true);


--
-- Name: subject_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.subject_id_seq', 6, true);


--
-- Name: teacher_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.teacher_id_seq', 5, true);


--
-- Name: class class_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.class
    ADD CONSTRAINT class_pkey PRIMARY KEY (id);


--
-- Name: student student_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.student
    ADD CONSTRAINT student_pkey PRIMARY KEY (id);


--
-- Name: subject subject_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.subject
    ADD CONSTRAINT subject_pkey PRIMARY KEY (id);


--
-- Name: teacher teacher_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.teacher
    ADD CONSTRAINT teacher_pkey PRIMARY KEY (id);


--
-- Name: student fk_class; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.student
    ADD CONSTRAINT fk_class FOREIGN KEY (classid) REFERENCES public.class(id) ON DELETE SET NULL;


--
-- Name: teacher fk_subject; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.teacher
    ADD CONSTRAINT fk_subject FOREIGN KEY (subjectid) REFERENCES public.subject(id) ON DELETE SET NULL;


--
-- Name: class fk_teacher; Type: FK CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.class
    ADD CONSTRAINT fk_teacher FOREIGN KEY (teacherid) REFERENCES public.teacher(id) ON DELETE SET NULL;


--
-- PostgreSQL database dump complete
--

