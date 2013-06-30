/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DomainModel;

import java.util.Objects;

/**
 *
 * @author Iara
 */
public class MaterialQuarto {
    int idMaterialQuarto;
    Material material;
    int qtde;
    boolean ativo;

    public int getIdMaterialQuarto() {
        return idMaterialQuarto;
    }

    public void setIdMaterialQuarto(int idMaterialQuarto) {
        this.idMaterialQuarto = idMaterialQuarto;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }


    public int getQtde() {
        return qtde;
    }

    public void setQtde(int qtde) {
        this.qtde = qtde;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + this.idMaterialQuarto;
        hash = 97 * hash + Objects.hashCode(this.material);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final MaterialQuarto other = (MaterialQuarto) obj;
        if (this.idMaterialQuarto != other.idMaterialQuarto) {
            return false;
        }
        if (!Objects.equals(this.material, other.material)) {
            return false;
        }
        
        return true;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
    
    
    
    
    
    
    
}
