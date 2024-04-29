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
public class Estoque {

    private Long id;
    private BigDecimal produto_id;
    private Integer quantidade;
    private Boolean estado;
    private Long usuario_id;
    private LocalDateTime datacriacao;

    public Estoque() {
    }

    public Estoque(Long id, BigDecimal produto_id, Integer quantidade, Boolean estado, Long usuario_id, LocalDateTime datacriacao) {
        this.id = id;
        this.produto_id = produto_id;
        this.quantidade = quantidade;
        this.estado = estado;
        this.usuario_id = usuario_id;
        this.datacriacao = datacriacao;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getProduto_id() {
        return produto_id;
    }

    public void setProduto_id(BigDecimal produto_id) {
        this.produto_id = produto_id;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public Long getUsuario_id() {
        return usuario_id;
    }

    public void setUsuario_id(Long usuario_id) {
        this.usuario_id = usuario_id;
    }

    public LocalDateTime getDatacriacao() {
        return datacriacao;
    }

    public void setDatacriacao(LocalDateTime datacriacao) {
        this.datacriacao = datacriacao;
    }

}
