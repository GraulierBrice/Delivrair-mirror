using System;
using System.ServiceModel;
using System.ServiceModel.Web;
using System.Collections.Generic;

using Partner.Data;

namespace Partner.Service
{
    [ServiceContract]
    public interface IParcelService
    {
      [OperationContract]
      [WebInvoke( Method = "GET", UriTemplate = "parcels/by_id/{identifier}",
                  ResponseFormat = WebMessageFormat.Json)]
      Parcel FindParcelById(int identifier);

    [OperationContract]
      [WebInvoke( Method = "GET", UriTemplate = "parcels/all_ids",
                  ResponseFormat = WebMessageFormat.Json)]
      List<int> GetAllParcelIds();

      [OperationContract]
      [WebInvoke( Method = "GET", UriTemplate = "parcels/by_shipper/{shipper}",
                  ResponseFormat = WebMessageFormat.Json)]
      List<int> FindParcelIdsByShipper(string shipper);
  }
}
