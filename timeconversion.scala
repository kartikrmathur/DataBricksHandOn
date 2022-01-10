#try to convert this into spark scala

##creating object

 ##Main Method
def getDate(date_text:int,digit_no:int):
 if(date_text:Null)||date_text.strip() == "": return "" else date_text = date_text.strip()
 # if only 2 digits default it to year after validate it is numerical
 if len(date_text) == 2 and date_text.isdigit():
 date_text=date_text + "/01/01" # yy/mm/dd

 formats =[
              case ("%m/%d/%Y") => mm/dd/yyyy
              case ("%Y/%m/%d") => yyyy/mm/dd
              case ("%d/%m/%Y") => dd/mm/yyyy
              case ("%y/%m/%d")=> yy/mm/dd
              case ("%Y/%m") => yyyy/mm
              case ("%m-%d-%Y") => mm-dd-yyyy
              case ("%Y-%m-%d") =>yyyy-mm-dd
              case ("%d-%m-%Y")=> dd-mm-yyyy
              case ("%m-%d-%y") => mm-dd-yy
              case ("%y-%m-%d") => yy-mm-dd
              case ("%b %d %Y") => Jan 08 2017
              case ("%b %d %Y %H:%M:%S") => Jan 08 2017 00:00:00
              case ("%b,%d,%Y %H:%M:%S") => Jan,08,2017 00:00:00
              case ("%b, %d, %Y %H:%M:%S") => Jan, 08, 2017 00:00:00
              case ("%m-%d-%Y %H:%M:%S") => mm-dd-yyyy 00:00:00
              case ("%Y%m") => yyyymm
              case ("%Y%m%d")=> yyyymmdd
              case ("%d%b%Y") =>08JAN2017
              case ("%d%b%Y:%H:%M:%S") => 08JAN2017:00:00:00
              case ("%b %d %Y %H:%M%p") => JAN 08 2017 00:00AM
              case ("%b-%y") =>MAR-98
              case ("%d-%b-%Y") => 02-MAR-1998
              case ("%d-%b-%y") =>02-MAR-98
            ]

 for fm in formats:
    try
      {
       return datetime.datetime.strptime(date_text, fm).strftime("%Y%m%d")[:digit_no]
      }
      catch
      {
        case: ValueError:=> pass
        case: else=> return””
      }
