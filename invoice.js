var fs = require('fs')

invoice = {
  "_id": "a9f88ba1a38ec88771cb5974db0012a3",
  "object_name": "string_value",
  "object_name": 1,
  "array_name": [
      1,
      2,
      3,
      4
  ],
  "invoice_number": 1000,
  "is_exempt": true,
  "transactions"    : 
  [
    {
      "transaction_id"  : 1,
      "amount"          : 20.80
    },
    {
      "transaction_id"  : 2,
      "amount"          : 32.15
    }
  ]
}

fs.writeFileSync('./testout.json', invoice);