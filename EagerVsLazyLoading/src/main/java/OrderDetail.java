import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;



@Entity
@Table (name = "USER_ORDER_LAZY_LOADING")
public class OrderDetail implements Serializable {
    
    @Id
    @GeneratedValue
    @Column(name="ORDER_ID")
    private Long orderId;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="USER_ID")
    private UserLazy user;

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public UserLazy getUser() {
		return user;
	}

	public void setUser(UserLazy user) {
		this.user = user;
	}

	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OrderDetail other = (OrderDetail) obj;
		return Objects.equals(orderId, other.orderId) && Objects.equals(user, other.user);
	}

   
    // also override equals and hashcode
    

}