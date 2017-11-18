using System;
namespace PROD_DB
{
    public class ProductionOrder
    {
   
        private String noLote;
        private int idAsignedProduct;
        private DateTime creationDate;
        private DateTime finishedDate;
        private String status; //has to be changed to a Enum Status

        public ProductionOrder(String _noLote)
        {
            this.noLote = _noLote;
        }

        public ProductionOrder(String _noLote, int _id, DateTime _creationDate, DateTime _finishedDate,
                String _status)
        {
            this.noLote = _noLote;
            this.idAsignedProduct = _id;
            this.creationDate = _creationDate;
            this.finishedDate = _finishedDate;
            this.status = _status;
        }

        public String getNoLote() { return this.noLote; }

        public int getIdAsignedProd() { return this.idAsignedProduct; }
        public void setIdAsignedProd(int _id) { this.idAsignedProduct = _id; }

        public DateTime getCreationDate() { return this.creationDate; }

        public DateTime getFinishedDate() { return this.finishedDate; }

        public String getStatus() { return this.status; }


        private String newProductionNumber()
        {
            //TODO code; create a function that gets a new NoLote.
            return "";
        }
    }
}
