import 'package:flutter/material.dart';


class LowsListview extends StatefulWidget {

  LowsListview({Key key, this.title}) : super(key: key); 
  final String title;
  @override 
  _LowsListviewState createState() => new _LowsListviewState();
  
}


class _LowsListviewState extends State<LowsListview> {
  @override 
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: new AppBar(
        title: new Text(widget.title),
      ),
      body: new ListView(
        padding: EdgeInsets.all(10),
        children: <Widget>[
        ListTile(
          leading: Icon(Icons.description, size: 30),
          title: Text(
              'Lows 1',
              style: TextStyle(
                fontSize: 18,
                fontWeight: FontWeight.w700
              ),
            ),
          subtitle: Text(
              'The context of Lows 1 is XXXXXXXXXX',
              style: TextStyle(
                fontStyle: FontStyle.italic
              ),
            ),
          trailing: Icon(Icons.arrow_right),
        ),
          ListTile(
            leading: Icon(Icons.description, size: 30),
            title: Text(
              'Lows 2',
              style: TextStyle(
                  fontSize: 18,
                  fontWeight: FontWeight.w700
              ),
            ),
            subtitle: Text(
              'The context of Lows 2 is XXXXXXXXXX',
              style: TextStyle(
                  fontStyle: FontStyle.italic
              ),
            ),
            trailing: Icon(Icons.arrow_right),
          ),
          ListTile(
            leading: Icon(Icons.description, size: 30),
            title: Text(
              'Lows 3',
              style: TextStyle(
                  fontSize: 18,
                  fontWeight: FontWeight.w700
              ),
            ),
            subtitle: Text(
              'The context of Lows 3 is XXXXXXXXXX',
              style: TextStyle(
                  fontStyle: FontStyle.italic
              ),
            ),
            trailing: Icon(Icons.arrow_right),
          )
      ],
      ),
    );
//    return ListView(
//      padding: EdgeInsets.all(10),
//      children: <Widget>[
//        ListTile(
//          leading: Icon(Icons.description, size: 30),
//          title: Text(
//              '华强北',
//              style: TextStyle(
//                fontSize: 18,
//                fontWeight: FontWeight.w700
//              ),
//            ),
//          subtitle: Text(
//              '深圳华强北',
//              style: TextStyle(
//                fontStyle: FontStyle.italic
//              ),
//            ),
//          trailing: Icon(Icons.arrow_right),
//        ),
//        ListTile(
//          title: Text('华强北'),
//          subtitle: Text('深圳华强北'),
//        ),
//        ListTile(
//          title: Text('华强北'),
//          subtitle: Text('深圳华强北'),
//        ),
//        ListTile(
//          title: Text('华强北'),
//          subtitle: Text('深圳华强北'),
//        )
//      ],
//    );
  }
}