const Products = () => {
  return (
    <div className="users-container">
      <div className="div-users">
        <div>
          <div>
            <h1>Productos</h1>
          </div>
          <div className="table-users-container">
            <table>
              <thead>
                <th>#</th>
                <th>Denominación</th>
                <th>Precio de venta</th>
                <th>Precio de costo</th>
                <th>Tiempo estimado</th>
                <th>Categoría</th>
              </thead>
              <tbody>
                <tr>
                  <td>1</td>
                  <td>Hamburguesa cheddar</td>
                  <td>$15.000</td>
                  <td>$8.500</td>
                  <td>40min</td>
                  <td>Hamburguesas</td>
                </tr>
                <tr>
                  <td>2</td>
                  <td>Fugazza</td>
                  <td>$20.000</td>
                  <td>$12.000</td>
                  <td>1h</td>
                  <td>Pizzas</td>
                </tr>
              </tbody>
            </table>
          </div>
        </div>
      </div>
    </div>
  );
};

export default Products;
