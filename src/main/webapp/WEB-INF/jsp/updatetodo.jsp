<%@ include file="common/header.jspf"%>
<%@ include file="common/navigation.jspf"%>
<div class="container">
    <div class="row">
        <div class="col-md-6 col-md-offset-3 ">
            <div class="panel panel-primary">
                <div class="panel-heading">Modificar tarea</div>
                <div class="panel-body">
                    <form:form method="post" modelAttribute="todo">
                        <form:hidden path="id" />

                        <fieldset class="form-group">
                            <form:label path="TodoName">Nombre Tarea</form:label>
                            <form:input path="TodoName" type="text" class="form-control"
                                        required="required" />
                            <form:errors path="TodoName" cssClass="text-warning" />
                        </fieldset>

                        <fieldset class="form-group">
                            <form:label path="Duracion">Duración</form:label>
                            <form:input path="Duracion" type="text" class="form-control"
                                        required="required" />
                            <form:errors path="Duracion" cssClass="text-warning" />
                        </fieldset>

                        <fieldset class="form-group">
                            <form:label path="Prioridad">Prioridad</form:label>
                            <form:input path="Prioridad" type="text" class="form-control"
                                        required="required" />
                            <form:errors path="Prioridad" cssClass="text-warning" />
                        </fieldset>

                        <fieldset class="form-group">
                            <form:label path="Descripcion">Descripción</form:label>
                            <form:input path="Descripcion" type="text" class="form-control"
                                        required="required" />
                            <form:errors path="Descripcion" cssClass="text-warning" />
                        </fieldset>


                        <fieldset class="form-group">
                            <form:label path="Lista">Lista</form:label>
                            <form:input path="Lista" list="Lista" class="form-control"
                                        required="required" />
                            <form:errors path="Lista" cssClass="text-warning" />
                            <datalist id="Lista">
                                <option value="Lista General (por defecto)"></option>
                                <option value="Lista A"></option>
                                <option value="Lista B"></option>
                                <option value="Lista B"></option>
                                <option value="Lista C"></option>
                            </datalist> 
                        </fieldset>
                            
                        <button type="submit" class="btn btn-success">Guardar</button>
                    </form:form>
                </div>
            </div>
        </div>
    </div>
</div>
<%@ include file="common/footer.jspf"%>
