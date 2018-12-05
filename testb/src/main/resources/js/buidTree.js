/**
 * @param rows  具有父子结构的 集合
 * @param id   节点id 属性名称
 * @param pid  上级节点id 属性名称
 * @returns
 * @author wjb
 */
function buildTree(rows,id,pid){
	var tree = [];
	var nodeMap = {};
	for(var i=0;i<rows.length;i++){
		nodeMap[rows[i][id]] = rows[i];
	}
	
	for(var j=0;j<rows.length;j++){
		if(!rows[j][pid]){
			tree.push(rows[j]);
		}
		if(rows[j][pid] && nodeMap[rows[j][pid]]) {
			if(nodeMap[rows[j][pid]].children){
			   nodeMap[rows[j][pid]].children.push(rows[j]);
			}else{
				nodeMap[rows[j][pid]].children = [];
				nodeMap[rows[j][pid]].children.push(rows[j]);
			}
		}
	}
	
	return tree;
}