# coding=utf-8
'''
Created on 2018年12月26日

@author: Administrator
'''
import time
import pandas as pd

import cx_Oracle  

import os  
os.environ['NLS_LANG'] = 'SIMPLIFIED CHINESE_CHINA.UTF8' 

print time.strftime('%Y-%m-%d %H:%M:%S',time.localtime(time.time()))

db=cx_Oracle.connect('bidw/acca_1234@10.1.19.149:1521/bidwcz') 

print (db.version)  

cr=db.cursor()  

sql=("select cpnfpm,tktprm,"
     "tkttkt,tktcpn,tktdoi,tkttky,tktsty,"
     "cpnclc,"
     "hbtind,hbthub,hbtgrp,hbtsix"
     " from dwp_psalcpnm_201811271"
     " where rownum<100")  

cr.execute(sql)  

rs=cr.fetchall() 
zz=pd.DataFrame(rs) 
'''
zz=pd.DataFrame(rs,columns=['cpnfpm','tktprm',
                            'tkttkt','tktcpn','tktdoi','tkttky','tktsty',
                             'cpnclc',
                             'hbtind','hbthub','hbtgrp','hbtsix']);  

text = zz.loc[:,'hbtgrp']
text = pd.Series([text[item].decode('GBK').encode('UTF-8') for item in text])

zz.loc[:,'hbtgrp'] = text
'''

print (zz)  

db.close() 