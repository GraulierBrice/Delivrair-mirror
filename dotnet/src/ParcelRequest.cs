using System.Runtime.Serialization;
using System;

namespace Partner.Data {
  [DataContract(Namespace = "http://partners/parcels/data/",
                Name = "ParcelRequest")]
  public class ParcelRequest
  {
    [DataMember] public int Identifier { get; set; }
    [DataMember] public string Owner { get; set; }
    [DataMember] public string Shipper { get; set; }
    [DataMember] public string Destination { get; set; }

    public override string ToString() {
        return string.Format(
            "ParcelRequest[{0}, {1}, {2}, {3}]",
            Identifier, Owner, Shipper, Destination
        );
    }
}
  [DataContract(Namespace = "http://partner/external/payment/data/",
                Name = "Payment")]
  public class Parcel
  {
    [DataMember] public int Identifier { get; set; }
    [DataMember] public string Owner { get; set; }
    [DataMember] public string Shipper { get; set; }
    [DataMember] public string Destination { get; set; }
  }
}
