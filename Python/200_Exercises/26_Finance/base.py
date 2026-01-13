#Run "pip install yfinance" in a terminal

import yfinance as yf
thislist = ["GOOGL" , "TGT" , "NKE" , "SBUX" , "AAPL" , "HD" , "DIS" , "AMZN" , "BTC-USD" , "BRK-B"]

for x in range (0,10):
    stock = yf.Ticker(thislist[])
    current_price = stock.history(period="1d")["Close"][0]
    info = stock.info
    
    print(info["longName"])
    print(info["website"])
    print(thislist + " Current Price:", current_price)