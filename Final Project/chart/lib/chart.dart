import 'package:flutter/material.dart';
import 'package:charts_flutter/flutter.dart' as charts;
import 'dart:math';
import 'package:flutter/services.dart';

class ChartPage extends StatefulWidget {
  ChartPage({Key key, this.title}) : super(key: key);

  final String title;

  @override
  _ChartPageState createState() => new _ChartPageState();
}

class ClicksPerYear {
  final String year;
  final int clicks;
  final charts.Color color;

  ClicksPerYear(this.year, this.clicks, Color color)
      : this.color = new charts.Color(
            r: color.red, g: color.green, b: color.blue, a: color.alpha);
}

class TimeSeriesSales {
  final DateTime time;
  final int sales;

  TimeSeriesSales(this.time, this.sales);
}

class _ChartPageState extends State<ChartPage> {
  int _counter = 19;

  final serialdata = [
    new TimeSeriesSales(new DateTime(2000), 17),
    new TimeSeriesSales(new DateTime(2001), 24),
    new TimeSeriesSales(new DateTime(2002), 56),
    new TimeSeriesSales(new DateTime(2003), 13),
    new TimeSeriesSales(new DateTime(2004), 77),
    new TimeSeriesSales(new DateTime(2005), 26),
    new TimeSeriesSales(new DateTime(2006), 55),
    new TimeSeriesSales(new DateTime(2007), 43),
    new TimeSeriesSales(new DateTime(2008), 76),
    new TimeSeriesSales(new DateTime(2009), 22),
    new TimeSeriesSales(new DateTime(2010), 17),
    new TimeSeriesSales(new DateTime(2011), 73),
    new TimeSeriesSales(new DateTime(2012), 64),
    new TimeSeriesSales(new DateTime(2013), 34),
    new TimeSeriesSales(new DateTime(2014), 55),
    new TimeSeriesSales(new DateTime(2015), 34),
    new TimeSeriesSales(new DateTime(2016), 11),
    new TimeSeriesSales(new DateTime(2017), 88),
    new TimeSeriesSales(new DateTime(2018), 56),
  ];

  Random random = new Random();

  void initState() {
    super.initState();
    SystemChrome.setPreferredOrientations([
      DeviceOrientation.landscapeLeft,
      DeviceOrientation.landscapeRight
    ]);
  }

  void _incrementCounter() {
    setState(() {
      _counter++;
      serialdata.add(new TimeSeriesSales(
          new DateTime(2017, 9, _counter), random.nextInt(100)));
    });
  }

  @override
  Widget build(BuildContext context) {
    List<charts.Series<TimeSeriesSales, DateTime>> seriesList = [
      new charts.Series<TimeSeriesSales, DateTime>(
        id: 'Sales',
        colorFn: (_, __) => charts.MaterialPalette.blue.shadeDefault,
        domainFn: (TimeSeriesSales sales, _) => sales.time,
        measureFn: (TimeSeriesSales sales, _) => sales.sales,
        data: serialdata,
      )
    ];

    var chart = new charts.TimeSeriesChart(
      seriesList,
      animate: true,

    );
    var chartWidget = new Padding(
      padding: new EdgeInsets.all(32.0),
      child: new SizedBox(
        height: 200.0,
        child: chart,
      ),
    );

    return new Scaffold(
      appBar: new AppBar(
        title: new Text(widget.title),
      ),
      body: new Center(
        child: new Column(
          children: <Widget>[
            chartWidget,
          ],
        ),
      ),
      floatingActionButton: new FloatingActionButton(
        onPressed: _incrementCounter,
        tooltip: 'Increment',
        child: new Icon(Icons.add),
      ),
    );
  }
}
