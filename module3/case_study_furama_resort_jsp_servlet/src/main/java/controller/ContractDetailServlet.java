package controller;

import model.bean.contract.AttachService;
import model.bean.contract.Contract;
import model.bean.contract.ContractDetail;
import model.service.IAttachService;
import model.service.IContract;
import model.service.IContractDetail;
import model.service.impl.AttachServiceImpl;
import model.service.impl.ContractDetailService;
import model.service.impl.ContractImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.util.List;

@WebServlet(name = "ContractDetailServlet", urlPatterns = "/contractDetail")
public class ContractDetailServlet extends HttpServlet {
    IContractDetail iContractDetail=new ContractDetailService();
    IAttachService iAttachService=new AttachServiceImpl();
    IContract icontract=new ContractImpl();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        switch (action){
            case "add":
                create(request,response);
                break;
        }
    }

    private void create(HttpServletRequest request, HttpServletResponse response) {
        int contractId=Integer.parseInt(request.getParameter("contractId"));
        int attachServiceId=Integer.parseInt(request.getParameter("attachServiceId"));
        int quantity=Integer.parseInt(request.getParameter("quantity"));
        Contract contract=icontract.findById(contractId);
        AttachService attachService=iAttachService.finById(attachServiceId);
        ContractDetail contractDetail=new ContractDetail(contract,attachService,quantity);
        iContractDetail.createContractDetail(contractDetail);
        request.setAttribute("message","\n" +
                "Create successful");
        RequestDispatcher requestDispatcher=request.getRequestDispatcher("/contract_detail/add-contract-detail.jsp");
        try {
            requestDispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        switch (action){
            case "add":
                ShowFormCreate(request,response);
                break;
        }
    }

    private void ShowFormCreate(HttpServletRequest request, HttpServletResponse response) {
        List<AttachService> attachServices=iAttachService.findAll();
        List<Contract> contracts=icontract.findAll();
        System.out.println(contracts.size());
        request.setAttribute("attachServices",attachServices);
        request.setAttribute("contracts",contracts);
        RequestDispatcher requestDispatcher=request.getRequestDispatcher("/contract_detail/add-contract-detail.jsp");
        try {
            requestDispatcher.forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
