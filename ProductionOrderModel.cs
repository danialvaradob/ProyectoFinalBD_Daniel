using System;
namespace PROD_DB
{
    public class ProductionOrderModel
    {
        public ProductionOrderModel()
        {
        }
        private ProductionOrder prodOrder;
        private DBConnection connection;

        public ProductionOrderModel(ProductionOrder _productinoOrder) {
            prodOrder = _productinoOrder;
            connection = DBConnection.getInstance().connect();
        }

        public boolean insert()
        {
            CallableStatement cStmt;
            try
            {
                cStmt = connection.prepareCall(Utility.INSERT_PROD_ORDER);

                cStmt.setString(1, prodOrder.getNoLote());
                cStmt.setInt(2, prodOrder.getIdAsignedProd());
                cStmt.setDate(3, prodOrder.getCreationDate());
                cStmt.setDate(4, prodOrder.getFinishedDate());
                cStmt.setString(5, prodOrder.getStatus());


                cStmt.execute();
                return true;
            }
            catch (SQLException | NullPointerException e) {
                System.err.println("No se pudo realizar la consulta");
                System.err.println(e.getMessage());
                return false;
            } finally
            {
                DBConnection.getInstance().disconnect();
            }
        }

        public boolean delete()
        {
            CallableStatement cStmt;
            try
            {
                cStmt = connection.prepareCall(Utility.DELETE_PROD_ORDER);
                cStmt.setString(1, prodOrder.getNoLote());
                cStmt.execute();
                return true;
            }
            catch (SQLException | NullPointerException e) {
                System.err.println("No se pudo realizar la consulta");
                System.err.println(e.getMessage());
                return false;
            } finally
            {
                DBConnection.getInstance().disconnect();
            }
        }
    }
}
