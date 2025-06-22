### FBG trading API

Goal
1. An API which can be used as types in Typescript.
2. An API which can be used to convert to and from QuickFixJ and also the FIX spec itself.

Design
1. "enums"
   2. These are Kotlin representations of the "FIX Spec"
2. "domain"
   3. Also Kotlin representations of the FIX Spec, but for **'messages'**
      4. e.g. **NewOrder**
         5. Sent to OEMS to generate an order into the market.
      6. 