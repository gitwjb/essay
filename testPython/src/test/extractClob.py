# coding=utf-8
'''
Created on 2018年12月25日

@author: Administrator
'''
import time
import cx_Oracle
import os  
os.environ['NLS_LANG'] = 'SIMPLIFIED CHINESE_CHINA.UTF8' 

print time.strftime('%Y-%m-%d %H:%M:%S',time.localtime(time.time()))
conn = cx_Oracle.connect('smartrix_dev/smartrix_1234@10.1.15.55:1523/SMXT')
cursor = conn.cursor()
cursor.execute("SELECT length(text),text FROM test")
rows = cursor.fetchone()
print rows[0],rows[1]
print rows
print (rows)
print time.strftime('%Y-%m-%d %H:%M:%S',time.localtime(time.time()))
cursor.close()
conn.close()