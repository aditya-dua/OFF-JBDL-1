import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;



@Entity
@Table(name = "USER_EAGER_LOADING")
public class UserEager implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "USER_ID")
    private Long userId;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "user")
    private Set<OrderDetailEager> orderDetail = new HashSet();

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Set<OrderDetailEager> getOrderDetail() {
		return orderDetail;
	}

	public void setOrderDetail(Set<OrderDetailEager> orderDetail) {
		this.orderDetail = orderDetail;
	}

	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserEager other = (UserEager) obj;
		return Objects.equals(orderDetail, other.orderDetail) && Objects.equals(userId, other.userId);
	}

    

}