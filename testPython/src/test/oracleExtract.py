# coding=utf-8
'''
Created on 2018年12月25日

@author: Administrator
'''
import time
import cx_Oracle
#cx_Oracle.connect("bidw","acca_1234","10.1.19.149:1521/bidwcz")
print time.strftime('%Y-%m-%d %H:%M:%S',time.localtime(time.time()))
conn = cx_Oracle.connect('bidw/acca_1234@10.1.19.149:1521/bidwcz')
cursor = conn.cursor()
cursor.execute("SELECT * FROM dwp_psalcpnm_201811271")
rows = cursor.fetchone()
print rows[0]
print time.strftime('%Y-%m-%d %H:%M:%S',time.localtime(time.time()))
cursor.close()
conn.close()