package com.erp.administrator.domain.model.entities;


import jakarta.persistence.*;

@Entity
@Table(name = "tb_access_manager")
public class AccessManager {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_access_manager", nullable = false)
    private Long idAccess_manager;

    @Column(name = "id_license", nullable = false)
    private Long idLicense;
    @Column(name = "administrator", nullable = false)
    private Boolean administrator;
    @Column(name = "sales", nullable = false)
    private Boolean sales;
    @Column(name = "inventory", nullable = false)
    private Boolean inventory;
    @Column(name = "pucharsing", nullable = false)
    private Boolean pucharsing;
    @Column(name = "reports", nullable = false)
    private Boolean reports;
    @Column(name = "financial", nullable = false)
    private Boolean financial;
    @Column(name = "humanResources", nullable = false)
    private Boolean humanResources;

    public AccessManager(){}
    public AccessManager(Long idAccess_manager, Long idLicense, Boolean administrator, Boolean sales, Boolean inventory, Boolean pucharsing, Boolean reports, Boolean financial, Boolean humanResources) {
        this.idAccess_manager = idAccess_manager;
        this.idLicense = idLicense;
        this.administrator = administrator;
        this.sales = sales;
        this.inventory = inventory;
        this.pucharsing = pucharsing;
        this.reports = reports;
        this.financial = financial;
        this.humanResources = humanResources;
    }

    public Long getIdAccess_manager() {
        return idAccess_manager;
    }

    public void setIdAccess_manager(Long idAccess_manager) {
        this.idAccess_manager = idAccess_manager;
    }

    public Long getIdLicense() {
        return idLicense;
    }

    public void setIdLicense(Long idLicense) {
        this.idLicense = idLicense;
    }

    public Boolean getAdministrator() {
        return administrator;
    }

    public void setAdministrator(Boolean administrator) {
        this.administrator = administrator;
    }

    public Boolean getSales() {
        return sales;
    }

    public void setSales(Boolean sales) {
        this.sales = sales;
    }

    public Boolean getInventory() {
        return inventory;
    }

    public void setInventory(Boolean inventory) {
        this.inventory = inventory;
    }

    public Boolean getPucharsing() {
        return pucharsing;
    }

    public void setPucharsing(Boolean pucharsing) {
        this.pucharsing = pucharsing;
    }

    public Boolean getReports() {
        return reports;
    }

    public void setReports(Boolean reports) {
        this.reports = reports;
    }

    public Boolean getFinancial() {
        return financial;
    }

    public void setFinancial(Boolean financial) {
        this.financial = financial;
    }

    public Boolean getHumanResources() {
        return humanResources;
    }

    public void setHumanResources(Boolean humanResources) {
        this.humanResources = humanResources;
    }
}
