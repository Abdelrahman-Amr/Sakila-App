/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gov.iti.jets.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Abdolrahman
 */
@Entity
@Table(name = "store")
@Data
@NoArgsConstructor
public class Store implements BaseEntity {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "store_id")
    private Short storeId;
    @Basic(optional = false)
    @Column(name = "last_update")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastUpdate;
    @OneToMany( mappedBy = "storeId")
    private List<Staff> staffList;
    @JoinColumn(name = "address_id", referencedColumnName = "address_id")
    @ManyToOne(optional = false)
    private Address addressId;
    @JoinColumn(name = "manager_staff_id", referencedColumnName = "staff_id")
    @OneToOne(optional = false)
    private Staff managerStaffId;
    @OneToMany( mappedBy = "storeId")
    private List<Inventory> inventoryList;
    @OneToMany( mappedBy = "storeId")
    private List<Customer> customerList;


    @Override
    public int hashCode() {
        int hash = 0;
        hash += (storeId != null ? storeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Store)) {
            return false;
        }
        Store other = (Store) object;
        if ((this.storeId == null && other.storeId != null) || (this.storeId != null && !this.storeId.equals(other.storeId))) {
            return false;
        }
        return true;
    }

//    @Override
//    public String toString() {
//        return "entity.Store[ storeId=" + storeId + " ]";
//    }
@Override
public String toString() {
    return "entity.Store[ storeId=" + storeId +" addressId"+addressId.getAddressId();
}
    
}
