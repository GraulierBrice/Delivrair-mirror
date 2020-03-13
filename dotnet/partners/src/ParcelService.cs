using System;
using System.Net;
using System.ServiceModel;
using System.ServiceModel.Web;
using System.Collections.Generic;
using System.Linq;
using Partner.Data;

namespace Partner.Service {

  [ServiceBehavior(InstanceContextMode = InstanceContextMode.Single)]
  public class ParcelService : IParcelService
  {
    private const string MagicKey = "896983"; // ASCII code for "YES"

    private List<Parcel> parcels = new List<Parcel>() {
      new Parcel() { Identifier=1, Owner="Mr. Truc", Shipper="FedEx", Destination="Paris" },
      new Parcel() { Identifier=2, Owner="Mr. Machin", Shipper="FedEx", Destination="Paris" },
      new Parcel() { Identifier=3, Owner="Mr. Bidule", Shipper="xEdeF", Destination="Paris" },
    };

    private void StatusNotFound() {
      WebOperationContext.Current.OutgoingResponse.StatusCode = HttpStatusCode.NotFound;
    }

    public Parcel FindParcelById(int identifier) {
      Parcel parcel = parcels.Find(p => p.Identifier == identifier);
      if (parcel == null) StatusNotFound();
      return parcel;
    }

    public List<int> FindParcelIdsByShipper(string shipper) {
      return parcels.FindAll(p => p.Shipper.ToLower().Equals(shipper.ToLower())).Select(p => p.Identifier).ToList();
    }

    public List<int> GetAllParcelIds() => parcels.Select(parcel => parcel.Identifier).ToList();
  }
}
