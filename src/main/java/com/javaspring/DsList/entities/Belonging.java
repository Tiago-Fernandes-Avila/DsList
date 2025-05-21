package com.javaspring.DsList.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_belonging")
public class Belonging {
    @EmbeddedId
   private BelongingPK belongingPK;
   private Integer position;

   public Belonging (){

   }

   public Belonging(Game game, GameList list, Integer integer) {
    this.belongingPK.setGame(game);
    this.belongingPK.setList(list);
    this.position = integer;
    
   }

   @Override
   public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((belongingPK == null) ? 0 : belongingPK.hashCode());
    return result;
   }

   @Override
   public boolean equals(Object obj) {
    if (this == obj)
        return true;
    if (obj == null)
        return false;
    if (getClass() != obj.getClass())
        return false;
    Belonging other = (Belonging) obj;
    if (belongingPK == null) {
        if (other.belongingPK != null)
            return false;
    } else if (!belongingPK.equals(other.belongingPK))
        return false;
    return true;
   }

   public BelongingPK getBelongingPK() {
    return belongingPK;
   }

   public void setBelongingPK(BelongingPK belongingPK) {
    this.belongingPK = belongingPK;
   }

   public Integer getPosition() {
    return position;
   }

   public void setPosition(Integer position) {
    this.position = position;
   }

   
   

}
