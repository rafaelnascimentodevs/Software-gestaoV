package modelo.repositorio.implement;

import java.lang.reflect.Field;
import java.util.Set;
import modelo.repositorio.CrudRepositorio;
import org.reflections.ReflectionUtils;

public abstract class CrudRepositorioImplement<T> implements CrudRepositorio<T> {

    private Class<T> t;

    public CrudRepositorioImplement(Class<T> t) {

        this.t = t;
    }

    @Override
    public boolean salvar(T t) {

        Object id = null;

        Set<Field> campos = ReflectionUtils.getFields(this.t, e -> true);

        try {
            for (Field campo : campos) {
                if (campo.getName().equalsIgnoreCase("id")) {

                    id = campo.get(t);
                }
            }

            if (id == null) {

            }

            return false;
        } catch (Exception e) {
            
        throw new RuntimeException(e);
                    
        }

    }

}
