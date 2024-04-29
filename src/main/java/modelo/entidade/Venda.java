/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo.entidade;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 *
 * @author rafael
 */
public class Venda {
    private Long id;
    private BigDecimal totalVenda;
    private BigDecimal valorPago;
    private BigDecimal troco;
    private BigDecimal desconto;
    private Cliente cliente;
    private Usuario usuario;
    private LocalDateTime dataCriacao;
    private LocalDateTime ultimaAtualizacao;

    public Venda() {
    }

    public Venda(Long id, BigDecimal totalVenda, BigDecimal valorPago, BigDecimal troco, BigDecimal desconto, Cliente cliente, Usuario usuario, LocalDateTime dataCriacao, LocalDateTime ultimaAtualizacao) {
        this.id = id;
        this.totalVenda = totalVenda;
        this.valorPago = valorPago;
        this.troco = troco;
        this.desconto = desconto;
        this.cliente = cliente;
        this.usuario = usuario;
        this.dataCriacao = dataCriacao;
        this.ultimaAtualizacao = ultimaAtualizacao;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getTotalVenda() {
        return totalVenda;
    }

    public void setTotalVenda(BigDecimal totalVenda) {
        this.totalVenda = totalVenda;
    }

    public BigDecimal getValorPago() {
        return valorPago;
    }

    public void setValorPago(BigDecimal valorPago) {
        this.valorPago = valorPago;
    }

    public BigDecimal getTroco() {
        return troco;
    }

    public void setTroco(BigDecimal troco) {
        this.troco = troco;
    }

    public BigDecimal getDesconto() {
        return desconto;
    }

    public void setDesconto(BigDecimal desconto) {
        this.desconto = desconto;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public LocalDateTime getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(LocalDateTime dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public LocalDateTime getUltimaAtualizacao() {
        return ultimaAtualizacao;
    }

    public void setUltimaAtualizacao(LocalDateTime ultimaAtualizacao) {
        this.ultimaAtualizacao = ultimaAtualizacao;
    }
    
    
    
}
