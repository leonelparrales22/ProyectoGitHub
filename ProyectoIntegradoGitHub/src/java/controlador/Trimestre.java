package controlador;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;

import org.primefaces.event.ItemSelectEvent;
import org.primefaces.model.chart.BarChartModel;
import org.primefaces.model.chart.BubbleChartModel;
import org.primefaces.model.chart.CartesianChartModel;
import org.primefaces.model.chart.DonutChartModel;
import org.primefaces.model.chart.HorizontalBarChartModel;
import org.primefaces.model.chart.LineChartModel;
import org.primefaces.model.chart.MeterGaugeChartModel;
import org.primefaces.model.chart.OhlcChartModel;
import org.primefaces.model.chart.PieChartModel;

@Named("trimestre")
@RequestScoped
public class Trimestre implements Serializable {

    private LineChartModel lineModel2;
    private LineChartModel zoomModel;
    private CartesianChartModel combinedModel;
    private CartesianChartModel fillToZero;
    private LineChartModel areaModel;
    private BarChartModel barModel;
    private HorizontalBarChartModel horizontalBarModel;
    private PieChartModel pieModel2;
    private PieChartModel pieModel2016;
    private DonutChartModel donutModel2;
    private MeterGaugeChartModel meterGaugeModel2;
    private BubbleChartModel bubbleModel2;
    private OhlcChartModel ohlcModel;
    private OhlcChartModel ohlcModel2;
    private BarChartModel animatedModel2;
    private LineChartModel multiAxisModel;
    private LineChartModel dateModel;

    @PostConstruct
    public void init() {
        //trimestre();
        //trimestre2016();
        createPieModels();
    }

    public void itemSelect(ItemSelectEvent event) {
        FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Item selected",
                "Item Index: " + event.getItemIndex() + ", Series Index:" + event.getSeriesIndex());
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }

    public LineChartModel getLineModel2() {
        return lineModel2;
    }

    public LineChartModel getZoomModel() {
        return zoomModel;
    }

    public CartesianChartModel getCombinedModel() {
        return combinedModel;
    }

    public CartesianChartModel getAreaModel() {
        return areaModel;
    }

    public PieChartModel getPieModel2016() {
        return pieModel2016;
    }

    public void setPieModel2016(PieChartModel pieModel2016) {
        this.pieModel2016 = pieModel2016;
    }

    public PieChartModel getPieModel2() {
        return pieModel2;
    }

    public MeterGaugeChartModel getMeterGaugeModel2() {
        return meterGaugeModel2;
    }

    public DonutChartModel getDonutModel2() {
        return donutModel2;
    }

    public CartesianChartModel getFillToZero() {
        return fillToZero;
    }

    public BubbleChartModel getBubbleModel2() {
        return bubbleModel2;
    }

    public OhlcChartModel getOhlcModel() {
        return ohlcModel;
    }

    public OhlcChartModel getOhlcModel2() {
        return ohlcModel2;
    }

    public BarChartModel getBarModel() {
        return barModel;
    }

    public HorizontalBarChartModel getHorizontalBarModel() {
        return horizontalBarModel;
    }

    public BarChartModel getAnimatedModel2() {
        return animatedModel2;
    }

    public LineChartModel getMultiAxisModel() {
        return multiAxisModel;
    }

    public LineChartModel getDateModel() {
        return dateModel;
    }

    private void createPieModels() {
        createPieModel2();
        createPieModel2016();
    }

    private void createPieModel2() {
        pieModel2 = new PieChartModel();
        pieModel2.set("Trimestre 1", 1);
        pieModel2.set("Trimestre 2", 1);
        pieModel2.set("Trimestre 3", 1);
        pieModel2.set("Trimestre 4", 1);
        pieModel2.setTitle("trimestre año 2015");
        pieModel2.setLegendPosition("e");
        pieModel2.setFill(false);
        pieModel2.setShowDataLabels(true);
        pieModel2.setDiameter(150);
        pieModel2.setShadow(false);
    }

    private void createPieModel2016() {
        pieModel2016 = new PieChartModel();
        pieModel2016.set("Trimestre 1", 1);
        pieModel2016.set("Trimestre 2", 1);
        pieModel2016.set("Trimestre 3", 1);
        pieModel2016.set("Trimestre 4", 1);
        pieModel2016.setTitle("trimestre año 2016");
        pieModel2016.setLegendPosition("e");
        pieModel2016.setFill(false);
        pieModel2016.setShowDataLabels(true);
        pieModel2016.setDiameter(150);
        pieModel2016.setShadow(false);
    }

}
