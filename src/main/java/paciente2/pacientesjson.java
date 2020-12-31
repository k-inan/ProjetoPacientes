package paciente2;
import com.sun.xml.internal.ws.developer.SerializationFeature;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.databind.MappingIterator;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class pacientesjson {
    private static Object readAll() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    private int id;
    private String nome;
    private int nascimento;
    private String sexo;
    private int cep;
    private int idade;
    private String estado;
    private String endereco;
    private int numero;
    private String complemento;
    private String bairro;
    private String profissao; 
    private int telefone1;
    private String email;
    private int cpf;
    private int rg;
    private int telefone2;
    private int celular;


    public pacientesjson(){}
    public pacientesjson(int id, String nome, int nascimento, String sexo, int cep, int idade, String estado, String endereco, int numero, String complemento, String bairro, String profissao, int telefone1, String email, int cpf, int rg, int telefone2, int celular){
        this.id = id;
        this.nome = nome;
        this.nascimento = nascimento;
        this.sexo = sexo;
        this.cep = cep;
        this.idade = idade;
        this.estado = estado;
        this.endereco = endereco;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.profissao = profissao;
        this.telefone1 = telefone1;
        this.email = email;
        this.cpf = cpf;
        this.rg = rg;
        this. telefone2 = telefone2;
        this.celular = celular;
        
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNascimento() {
        return nascimento;
    }

    public void setNascimento(int nascimento) {
        this.nascimento = nascimento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public int getTelefone1() {
        return telefone1;
    }

    public void setTelefone1(int telefone1) {
        this.telefone1 = telefone1;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public int getRg() {
        return rg;
    }

    public void setRg(int rg) {
        this.rg = rg;
    }

    public int getTelefone2() {
        return telefone2;
    }

    public void setTelefone2(int telefone2) {
        this.telefone2 = telefone2;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }
    
    public static void main(String[] args) throws IOException {
        CsvSchema pacientesjsonSchema = CsvSchema.emptySchema().withHeader();
        CsvMapper csvMapper = new CsvMapper();
        MappingIterator<pacientesjson> pacientesjson = csvMapper.readerFor(pacientesjson.class).with(pacientesjsonSchema).readValues(new File("C:\\Users\\Pc\\Downloads\\exercício seleção\\pacientes.csv"));
        new ObjectMapper().writeValue(new File("C:\\Users\\Pc\\Downloads\\exercício seleção\\pacientes.json"), pacientesjson.readAll());
    }
}

