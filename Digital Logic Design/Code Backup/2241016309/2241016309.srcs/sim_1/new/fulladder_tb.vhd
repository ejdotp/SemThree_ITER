----------------------------------------------------------------------------------
-- Company: 
-- Engineer: 
-- 
-- Create Date: 12/02/2023 02:44:48 PM
-- Design Name: 
-- Module Name: fulladder_tb - dataflow
-- Project Name: 
-- Target Devices: 
-- Tool Versions: 
-- Description: 
-- 
-- Dependencies: 
-- 
-- Revision:
-- Revision 0.01 - File Created
-- Additional Comments:
-- 
----------------------------------------------------------------------------------


library IEEE;
use IEEE.STD_LOGIC_1164.ALL;

-- Uncomment the following library declaration if using
-- arithmetic functions with Signed or Unsigned values
--use IEEE.NUMERIC_STD.ALL;

-- Uncomment the following library declaration if instantiating
-- any Xilinx leaf cells in this code.
--library UNISIM;
--use UNISIM.VComponents.all;

entity fulladder_tb is
--  Port ( );
end fulladder_tb;

architecture dataflow of fulladder_tb is
component fulladder
port(x: in std_logic;
     y: in std_logic;
     Cin: in std_logic;
     sum: out std_logic;
     Cout: out std_logic);
end component;
signal x: std_logic;
signal y: std_logic;
signal Cin: std_logic;
signal sum: std_logic;
signal Cout: std_logic;
begin
uut: fulladder port map(x=>x, y=>y, Cin=>Cin, sum=>sum, Cout=>Cout);
stimulus: process
begin
x<='0'; y<='0'; Cin<='0'; wait for 10ns;
x<='0'; y<='0'; Cin<='1'; wait for 10ns;
x<='0'; y<='1'; Cin<='0'; wait for 10ns;
x<='0'; y<='1'; Cin<='1'; wait for 10ns;
x<='1'; y<='0'; Cin<='0'; wait for 10ns;
x<='1'; y<='0'; Cin<='1'; wait for 10ns;
x<='1'; y<='1'; Cin<='0'; wait for 10ns;
x<='1'; y<='1'; Cin<='1'; wait for 10ns;
end process;
end dataflow;
